package by.lessons.practices.class8;

import java.io.*;
import java.util.List;

public class Farm implements Externalizable {
    private String animal;
    private String name;

    public Farm(String animal, String name) {
        this.animal = animal;
        this.name = name;
    }

    public Farm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String toString() {
        return "На ферме живет: " + this.animal + " " + this.name;
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
    }

    public static void serialize(List<Farm> farms, File file) {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(farms);
        } catch (IOException e) {
            throw new RuntimeException("Error serializing Farm", e); // лучше пробрасывать оригинальное исключение
        }
    }

    public static List <Farm> deserialize(String file) {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            List <Farm> farmResult = (List<Farm>) objectInputStream.readObject();
            return farmResult;
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException("Error"); // лучше пробрасывать оригинальное исключение
        }
    }


}
