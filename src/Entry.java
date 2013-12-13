/**
 * Created with IntelliJ IDEA.
 * User: Rahmah Hadji Abdulmadid
 * Date: 12/7/13
 */
public class Entry {
    public static class Person{
        private static String firstname;
        private static String lastname;
        private static String address;
        private static String city;
        private static String state;
        private static String zipcode;
        private static String phone;

        public static void setFirstName(String fname){
            firstname = fname;
        }
        public  String getFirstName(){
            return firstname;
        }
        public static void setLastName(String lname){
            lastname = lname;
        }
        public String getLastName(){
            return lastname;
        }
        public static void setAddress(String address1){
            address = address1;
        }
        public String getAddress(){
            return address;
        }
        public static void setCity(String city1){
            city = city1;
        }
        public String getCity(){
            return city;
        }
        public static void setState(String state1){
            state = state1;
        }
        public String getState(){
            return state;
        }
        public static void setZipcode(String zipcode1){
            zipcode = zipcode1;
        }
        public String getZipCode(){
            return zipcode;
        }
        public static void setPhone(String phone1){
            phone = phone1;
        }
        public String getPhone(){
            return phone;
        }
    }
}
