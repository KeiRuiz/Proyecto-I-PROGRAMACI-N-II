package Data;

import Domain.Administrator;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author Zeii
 */
public class AdministratorData {

    //variable global que simula una base de datos
    final String jsonFilePath = "C:\\Users\\Usuario\\Desktop\\Proyecto I PROGRAMACIÓN II\\ParkingSystem\\administrators.json";

    public void insertAdministrator(Administrator administrator) throws IOException {
        JSONObject administratorObject = new JSONObject();
        //administratorObject.put("startDate", administrator.getStartDate());
//        administratorObject.put("schedule", administrator.getSchedule());
        administratorObject.put("identification", administrator.getIdentification());
        administratorObject.put("name", administrator.getName());
        administratorObject.put("username", administrator.getUsername());
        administratorObject.put("password", administrator.getPassword());

//true allows multiple insertions in the file
        try (FileWriter file = new FileWriter(jsonFilePath, true)) {
            file.write(administratorObject.toJSONString() + "\r\n");
        }
    }

    public void removeAdministrator(String administratorId) throws org.json.simple.parser.ParseException, ParseException {

        ArrayList<JSONObject> jsonArray = new ArrayList<>();
        JSONObject jsonObject;
// This will reference one line at a time
        String line = null;
        try {
// FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(jsonFilePath);
// Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                jsonObject = (JSONObject) new JSONParser().parse(line);
                jsonArray.add(jsonObject);
                Administrator administrator = new Administrator();
                administrator.setIdentification(jsonObject.get("identification").toString());

                if (administrator.getIdentification().equalsIgnoreCase(administratorId)) {
                    jsonObject.remove(line);
                    // Always close files.
                    bufferedReader.close();
                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + jsonFilePath + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + jsonFilePath + "'");
// Or we could just do this:
// ex.printStackTrace();
        }
    }

    public LinkedList<Administrator> getAllAdministrators() throws ParseException, org.json.simple.parser.ParseException {
        LinkedList<Administrator> administrators = new LinkedList<>();
        ArrayList<JSONObject> jsonArray = new ArrayList<>();
        JSONObject jsonObject;
// This will reference one line at a time
        String line = null;
        try {
// FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(jsonFilePath);
// Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                jsonObject = (JSONObject) new JSONParser().parse(line);
                jsonArray.add(jsonObject);
                Administrator administrator = new Administrator();

                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
//                administrator.setStartDate(formato.parse(jsonObject.get("startDate").toString()));
//                administrator.setSchedule(jsonObject.get("schedule").toString());
                administrator.setIdentification(jsonObject.get("identification").toString());
                administrator.setName(jsonObject.get("name").toString());
                administrator.setUsername(jsonObject.get("username").toString());
                administrator.setPassword(jsonObject.get("password").toString());

                System.out.println(administrator.toString());
                administrators.add(administrator);
            }
// Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + jsonFilePath + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + jsonFilePath + "'");
// Or we could just do this:
// ex.printStackTrace();
        }
        return administrators;
    }
   
   public Administrator findAdministratorById(String administratorId) throws FileNotFoundException, IOException, org.json.simple.parser.ParseException {
        ArrayList<JSONObject> jsonArray = new ArrayList<>();
        JSONObject jsonObject;
// This will reference one line at a time
        String line = null;

// FileReader reads text files in the default encoding.
        FileReader fileReader = new FileReader(jsonFilePath);
// Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Administrator administrator = new Administrator();
        while ((line = bufferedReader.readLine()) != null) {
            jsonObject = (JSONObject) new JSONParser().parse(line);
            jsonArray.add(jsonObject);
            administrator.setIdentification(jsonObject.get("startDate").toString());
//            administrator.setName(jsonObject.get("schedule").toString());
            administrator.setIdentification(jsonObject.get("identification").toString());
            administrator.setName(jsonObject.get("name").toString());
            administrator.setUsername(jsonObject.get("username").toString());
            administrator.setPassword(jsonObject.get("password").toString());
           
            Administrator currentAdministrator = new Administrator();
            
            if (administrator.getIdentification().equalsIgnoreCase(administratorId)) {
                administrator = currentAdministrator;
                // Always close files.
                bufferedReader.close();
            }
        }
        return administrator;
    }
   
   public Administrator findAdministratorByUsernameandPassword(String username, String password) throws FileNotFoundException, IOException, org.json.simple.parser.ParseException {
        ArrayList<JSONObject> jsonArray = new ArrayList<>();
        JSONObject jsonObject;
// This will reference one line at a time
        String line = null;

// FileReader reads text files in the default encoding.
        FileReader fileReader = new FileReader(jsonFilePath);
// Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        Administrator administrator = new Administrator();
        while ((line = bufferedReader.readLine()) != null) {
            jsonObject = (JSONObject) new JSONParser().parse(line);
            jsonArray.add(jsonObject);
            administrator.setIdentification(jsonObject.get("startDate").toString());
//            administrator.setName(jsonObject.get("schedule").toString());
            administrator.setIdentification(jsonObject.get("identification").toString());
            administrator.setName(jsonObject.get("name").toString());
            administrator.setUsername(jsonObject.get("username").toString());
            administrator.setPassword(jsonObject.get("password").toString());
           
            Administrator currentAdministrator = new Administrator();

            if (administrator.getUsername().equalsIgnoreCase(username)&&administrator.getPassword().equalsIgnoreCase(password)) {
                administrator = currentAdministrator;
                // Always close files.
                bufferedReader.close();
            }
        }
        return administrator;
    }

}

