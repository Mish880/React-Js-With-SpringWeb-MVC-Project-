package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@ToString
public class Customer {
    @Id
    private  String cusid;
    private  String cusname;
    private  String cusaddress;
    private  String cusnic;
    private  String cusemail;
    private  String custcontact;
}
