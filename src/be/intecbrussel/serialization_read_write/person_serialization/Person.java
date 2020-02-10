package be.intecbrussel.serialization_read_write.person_serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Timer;
import java.util.TimerTask;

public class Person implements Serializable {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private transient Timer heartbeat;


    public Person() {}

    public Person(String firstName, String lastName, LocalDate birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        heartbeat = new Timer(true);
        heartbeat.scheduleAtFixedRate(new HeartBeat(),0,1000);
    }

    private class HeartBeat extends TimerTask{

        @Override
        public void run() {
            System.out.println("*");
        }
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    private void readObject(ObjectInputStream inputStream) throws
            IOException,ClassNotFoundException {
        inputStream.defaultReadObject();
        heartbeat = new Timer(true);
        heartbeat.scheduleAtFixedRate(new HeartBeat(),0,1000);

    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
