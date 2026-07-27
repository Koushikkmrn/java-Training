package Day10;

interface Notification {
    void send();
}

class Email implements Notification {
    public void send() {
        System.out.println("Email Sent");
    }
}

class SMS implements Notification {
    public void send() {
        System.out.println("SMS Sent");
    }
}

class Push implements Notification {
    public void send() {
        System.out.println("Push Notification Sent");
    }
}

public class notificationssystem {
    public static void main(String[] args) {
        Notification n = new Email();
        n.send();

        n = new SMS();
        n.send();

        n = new Push();
        n.send();
    }
}