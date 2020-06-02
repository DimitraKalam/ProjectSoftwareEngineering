package HRDepartment;

public class RecruitmentForm {
    public RecruitmentForm(String name, String phone, String email, String department, String experience, String qualifications, double salary, String bio, String comment) {
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.department = department;
        this.experience = experience;
        this.qualifications = qualifications;
        this.salary = salary;
        this.bio = bio;
        this.comment = comment;
    }

    private String name;
    private String phone;
    private String email;
    private String department;
    private String experience;
    private String qualifications;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    private String bio;
    private String comment;
}
