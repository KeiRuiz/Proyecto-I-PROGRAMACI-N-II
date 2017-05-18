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
public class Administrator extends User{
    
    private ParkingLot parkingLot;

    public Administrator() {
        super ();
    }

    public Administrator(String identification, String name, String email, String phone, String username, String password, ParkingLot parkingLot) {
        super(identification, name, email, phone, username, password);
        this.parkingLot= parkingLot;
    }

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }
    
}
