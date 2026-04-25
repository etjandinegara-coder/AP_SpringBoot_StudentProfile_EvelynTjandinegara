package com.example.demo;

import java.util.List;

public class ModelStudent {
    private String fullname;
    private String nickname;
    private int age;
    private String birthdate;
    private String religion;
    private String address;
    private String gender;
    private String major;
    private List<String> imagefiles;
    private List<String> hobbies;

    public ModelStudent (String fullname, String nickname, int age, String birthdate, String religion, String address, String gender, String major, List<String> imagefiles, List<String> hobbies) {
        this.fullname = fullname;
        this.nickname = nickname;
        this.age = age;
        this.birthdate = birthdate;
        this.religion = religion;
        this.address = address;
        this.gender = gender;
        this.major = major;
        this.imagefiles = imagefiles;
        this.hobbies = hobbies;
    }

    public String getFullName() { 
        return fullname; 
    }

    public String getNickName() { 
        return nickname; 
    }

    public int getAge() { 
        return age; 
    }

    public String getBirthDate() { 
        return birthdate; 
    }

    public String getReligion() { 
        return religion; 
    }

    public String getAddress() { 
        return address; 
    }

    public String getGender() { 
        return gender; 
    }

    public String getMajor() { 
        return major; 
    }

    public List<String> getImageFiles() { 
        return imagefiles; 
    }

    public List<String> getHobbies() { 
        return hobbies; 
    }
}