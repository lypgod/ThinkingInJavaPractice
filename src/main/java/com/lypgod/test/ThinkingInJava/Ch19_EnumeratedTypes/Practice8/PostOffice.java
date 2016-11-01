package com.lypgod.test.ThinkingInJava.Ch19_EnumeratedTypes.Practice8;

import com.lypgod.test.ThinkingInJava.Ch19_EnumeratedTypes.Enums;

import java.util.Iterator;

class Mail {
    static long counter = 0;
    GeneralDelivery generalDelivery;
    Scannability scannability;
    Readability readability;
    ForwardAddress forwardAddress;
    Address address;
    ReturnAddress returnAddress;
    long id = counter++;

    // Generate test Mail:
    public static Mail randomMail() {
        Mail m = new Mail();
        m.generalDelivery = Enums.random(GeneralDelivery.class);
        m.scannability = Enums.random(Scannability.class);
        m.readability = Enums.random(Readability.class);
        m.forwardAddress = Enums.random(ForwardAddress.class);
        m.address = Enums.random(Address.class);
        m.returnAddress = Enums.random(ReturnAddress.class);
        return m;
    }

    public static Iterable<Mail> generator(final int count) {
        return new Iterable<Mail>() {
            int n = count;

            public Iterator<Mail> iterator() {
                return new Iterator<Mail>() {
                    public boolean hasNext() {
                        return n-- > 0;
                    }

                    public Mail next() {
                        return randomMail();
                    }

                    public void remove() { // not implemented
                        throw new UnsupportedOperationException();
                    }
                };
            }
        };
    }

    public String toString() {
        return "Mail " + id;
    }

    public String details() {
        return toString() + ", General Delivery: " + generalDelivery + ", Address Scannability: " + scannability + ", Address Readability: " + readability + ", ForwardAddress: " + forwardAddress + ", Address Address: " + address + ", Return address: " + returnAddress;
    }
    // The NO's lower the probability of random selection:
    enum GeneralDelivery {
        YES, NO1, NO2, NO3, NO4, NO5
    }
    enum Scannability {UNSCANNABLE, YES1, YES2,}

    enum Readability {ILLEGIBLE, YES1, YES2, YES3, YES4}

    enum ForwardAddress {YES, NO1, NO2, NO3, NO4, NO5}

    enum Address {INCORRECT, OK1, OK2, OK3, OK4, OK5}

    enum ReturnAddress {MISSING, OK1, OK2, OK3, OK4, OK5}
}

public class PostOffice {
    static void handle(Mail m) {
        for (MailHandler handler : MailHandler.values())
            if (handler.handle(m))
                return;
        System.out.println(m + " is a dead letter");
    }

    public static void main(String[] args) {
        for (Mail mail : Mail.generator(20)) {
            System.out.println(mail.details());
            handle(mail);
            System.out.println("*****");
        }
    }

    enum MailHandler {
        GENERAL_DELIVERY {
            boolean handle(Mail m) {
                switch (m.generalDelivery) {
                    case YES:
                        System.out.println("Using general delivery for " + m);
                        return true;
                    default:
                        return false;
                }
            }
        }, MACHINE_SCAN {
            boolean handle(Mail m) {
                switch (m.scannability) {
                    case UNSCANNABLE:
                        return false;
                    default:
                        switch (m.forwardAddress) {
                            case YES:
                                System.out.println("Forwarding " + m + " automatically");
                                return true;
                            default:
                                switch (m.address) {
                                    case INCORRECT:
                                        return false;
                                    default:
                                        System.out.println("Delivering " + m + " automatically");
                                        return true;
                                }
                        }


                }
            }
        }, FORWARDING {
            boolean handle(Mail m) {
                switch (m.forwardAddress) {
                    case YES:
                        System.out.println("Forwarding " + m);
                        return true;
                    default:
                        return false;

                }
            }
        }, VISUAL_INSPECTION {
            boolean handle(Mail m) {
                switch (m.readability) {
                    case ILLEGIBLE:
                        return false;
                    default:
                        switch (m.address) {
                            case INCORRECT:
                                return false;
                            default:
                                System.out.println("Delivering " + m + " normally");
                                return true;
                        }
                }
            }
        }, RETURN_TO_SENDER {
            boolean handle(Mail m) {
                switch (m.returnAddress) {
                    case MISSING:
                        return false;
                    default:
                        System.out.println("Return " + m + " to sender");
                        return true;
                }
            }
        };

        abstract boolean handle(Mail m);
    }
}