package org.example;

public class Person {
    private String first, last, DOB, email, phoneNumber, job;

    public Person(String first, String last, String DOB, String email, String phoneNumber, String job){
        this.first = first;
        this.last = last;
        this.DOB = DOB;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.job = job;
    }

    public Person(String first, String last, String phoneNumber){
        this(first, last, "unknown", "unknown", phoneNumber, "unknown");
    }

    public Person(String first, String last){
        /*this.first = first;
        this.last = last;
        DOB = "unknown";
        email = "unknown";
        phoneNumber = "unknown";
        job = "unknown";*/
        this(first, last, "unknown", "unknown", "unknown", "unknown");
    }

    //GOAL: write a good toString()
    /*
    Name: Christina Snyder
    DOB: 03/31/1992
    PhoneNumber: (678)123-4567
    Email: christina.snyder@kenzie.academy
    Job Title: Teacher

    Name: Willie Nelson
    DOB: unknown
    PhoneNumber: unknown
    Email: unknown
    Job Title: unknown

    Name: Willie Nelson
     */

    //GOAL: write a getAge(year) method based on DOB
    //03/31/1992
    //getAge(2022) -> 30
    // year - DOB XX
    //2022 - 03/31/1992?
    //year - birthYear -> How do we isolate birthyear from DOB?
    public int getAge(int year){
        if (DOB.equals("unknown")){
            System.out.println("We don't know " + first + "'s birthday");
            return -1;
        }
        String birthYearChars = DOB.substring(DOB.length() - 4);
        int birthYear = Integer.parseInt(birthYearChars);
        int age = year - birthYear;
        return age;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Name: ").append(first).append(" ").append(last);
        if (DOB.equals("unknown")){
            //leave it out, do nothing
        } else {
            sb.append("\nDOB: ").append(DOB);
        }

        if (!phoneNumber.equals("unknown")){ //if (phoneNumber != null)
            sb.append("\nPhone Number: ").append(phoneNumber);
        }
        if (!email.equals("unknown")){
            sb.append("\nEmail: ").append(email);
        }
        if (!job.equals("unknown")){
            sb.append("\nJob Title: ").append(job);
        }
        return sb.toString();
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        //if (firstLetter is capital){
            this.first = first;
        //}

    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
