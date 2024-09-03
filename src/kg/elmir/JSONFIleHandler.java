package kg.elmir;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class JSONFIleHandler {
    private static final Gson gson = new Gson();

    public static Truck[] getTrucks() {
        try (Reader reader = new FileReader("Trucks.json")){
            return gson.fromJson(reader, Truck[].class);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return new Truck[0];
    }
    public static void writeTrucks(Truck[] trucks){
        try (Writer writer = new FileWriter("Trucks.json")){
            String json = gson.toJson(trucks);
            writer.write(json);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    public static Driver[] getDriver(){
        try(Reader reader = new FileReader("Driver.json")){
            return gson.fromJson(reader, Driver[].class);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return new Driver[0];
    }
    public static void writeDriver(Driver[] drivers){
        try (Writer writer = new FileWriter("Driver.json")){
            String json = gson.toJson(drivers);
            writer.write(json);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
