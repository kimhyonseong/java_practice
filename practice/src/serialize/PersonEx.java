package serialize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class PersonEx implements Externalizable {
    private String name;
    private String job;

    public PersonEx(){}

    public PersonEx(String name, String job) {
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "PersonEx{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = in.readUTF();
        job = in.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(name);
        out.writeUTF(job);
    }
}
