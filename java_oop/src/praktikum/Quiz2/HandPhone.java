package praktikum.Quiz2;

interface Phone {
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;

    void powerOn();
    void powerOff();
    void volumeUp();
    void volumeDown();
    int getVolume();
}

class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50; // Default volume level
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Xiaomi is powered on.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Xiaomi is powered off.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Xiaomi volume increased to " + volume);
            } else {
                System.out.println("Xiaomi volume is already at MAX.");
            }
        } else {
            System.out.println("Xiaomi is off, cannot increase volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("Xiaomi volume decreased to " + volume);
            } else {
                System.out.println("Xiaomi volume is already at MIN.");
            }
        } else {
            System.out.println("Xiaomi is off, cannot decrease volume.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

class iPhone implements Phone {
    private int volume;
    private boolean isPowerOn;

    public iPhone() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone is powered on.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone is powered off.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("iPhone volume increased to " + volume);
            } else {
                System.out.println("iPhone volume is already at MAX.");
            }
        } else {
            System.out.println("iPhone is off, cannot increase volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("iPhone volume decreased to " + volume);
            } else {
                System.out.println("iPhone volume is already at MIN.");
            }
        } else {
            System.out.println("iPhone is off, cannot decrease volume.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

class Samsung implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Samsung() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung is powered on.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung is powered off.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Samsung volume increased to " + volume);
            } else {
                System.out.println("Samsung volume is already at MAX.");
            }
        } else {
            System.out.println("Samsung is off, cannot increase volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("Samsung volume decreased to " + volume);
            } else {
                System.out.println("Samsung volume is already at MIN.");
            }
        } else {
            System.out.println("Samsung is off, cannot decrease volume.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

class Oppo implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Oppo() {
        this.volume = 50;
        this.isPowerOn = false;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Oppo is powered on.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Oppo is powered off.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (volume < MAX_VOLUME) {
                volume += 10;
                System.out.println("Oppo volume increased to " + volume);
            } else {
                System.out.println("Oppo volume is already at MAX.");
            }
        } else {
            System.out.println("Oppo is off, cannot increase volume.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (volume > MIN_VOLUME) {
                volume -= 10;
                System.out.println("Oppo volume decreased to " + volume);
            } else {
                System.out.println("Oppo volume is already at MIN.");
            }
        } else {
            System.out.println("Oppo is off, cannot decrease volume.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

class PhoneUser {
    private Phone phone;

    public PhoneUser(Phone phone) {
        this.phone = phone;
    }

    public void turnOnThePhone() {
        phone.powerOn();
    }

    public void turnOffThePhone() {
        phone.powerOff();
    }

    public void makePhoneLouder() {
        phone.volumeUp();
    }

    public void makePhoneSilent() {
        phone.volumeDown();
    }
}


public class HandPhone {
    public static void main(String[] args) {
        // Create a new PhoneUser with a Xiaomi phone
        PhoneUser user = new PhoneUser(new Xiaomi());

        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();
        
        // You can change the phone to another type by passing a different phone instance
        System.out.println("\nSwitching to Samsung:");
        user = new PhoneUser(new Samsung());

        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();

        System.out.println("\nSwitching to Iphone:");
        user = new PhoneUser(new iPhone());

        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();

        System.out.println("\nSwitching to Oppo:");
        user = new PhoneUser(new Oppo());

        user.turnOnThePhone();
        user.makePhoneLouder();
        user.makePhoneSilent();
        user.turnOffThePhone();
    }
}
