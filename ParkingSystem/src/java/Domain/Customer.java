/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Zeii
 */
public class Customer extends User {

    private boolean disabilityPresented;

    public Customer() {
        super();
    }

    public Customer(String identification, String name, String email, String phone, String username, String password, boolean disabilityPresented) {
        super(identification, name, email, phone, username, password);
        this.disabilityPresented = disabilityPresented;
    }

    public boolean isDisabilityPresented() {
        return disabilityPresented;
    }

    public void setDisabilityPresented(boolean disabilityPresented) {
        this.disabilityPresented = disabilityPresented;
    }
}
