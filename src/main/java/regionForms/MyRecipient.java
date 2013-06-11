/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package regionForms;

/**
 *
 * @author alex
 */
public class MyRecipient {
  
  private String fieldName;
  private String address;
  private String postCode;
  private String city;

  public String getName() {
    return fieldName;
  }

  public void setName(String name) {
    this.fieldName = fieldName;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPostCode() {
    return postCode;
  }

  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }  
}
