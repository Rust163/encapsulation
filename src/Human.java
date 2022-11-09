public class Human {
    private String name;
    private String town;
    private int yearOfBirth;
    private String jobTitle;
    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name.length() != 0 && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Ошибка вы не ввели имя!";
        }

        if (town.length() != 0 && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Ошибка вы не ввели город!";
        }

        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (jobTitle.length() != 0 && !jobTitle.isEmpty() && !jobTitle.isBlank()) {
            this.jobTitle = jobTitle;
        } else {
            this.jobTitle = "Ошибка вы не ввели должность!";
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town != null && !town.isEmpty() && !town.isBlank()) {
            this.town = town;
        } else {
            this.town = "Ошибка вы не ввели город!";
        }
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
    }

    void info() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(-ась) " + yearOfBirth + " году. Я работаю на должности: " + jobTitle + ". Будем знакомы!");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
}

