package FactoryWorkersSalaryCalculate;

public class Employee {
    String name; // Employee name
    double salary; // Employee's salary
    int weeklyWorkingHour; // Weekly working hour
    int hireYear; // When employee started the job date

    Employee(String name, int salary, int weeklyWorkingHour, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.weeklyWorkingHour = weeklyWorkingHour;
        this.hireYear = hireYear;
    }
    double tax(){
        double tax = 0;
        if (this.salary>1000){
            tax = this.salary * 0.03;
            return tax;
        }
        return tax;
    }
    double bonus(){
        double bonus;
        if (this.weeklyWorkingHour > 40){
            bonus = (weeklyWorkingHour - 40) * 30;
            return bonus;
        }else {
            return 0;
        }

    }

    double riseSalary(){
        int workingYear = 2021 - hireYear;
        double riseSalary;
        if (workingYear < 10)
        {
            riseSalary = this.salary * 0.05;
        }
        else if (workingYear > 9 && workingYear < 20)
        {
            riseSalary = this.salary * 0.10;
        } else
        {
            riseSalary = this.salary * 0.15;
        }
        return riseSalary;

    }
    void employeeInfo(){
        double calculatedTax = tax();
        double calculatedBonus = bonus();
        double calculatedRise = riseSalary();

        System.out.println("Adı : " + this.name + "\nMaaşı : " + this.salary + "\nÇalışma saati : " + this.weeklyWorkingHour +
                "\nBaşlangıç yılı : " + this.hireYear +
                "\nVergi : " + tax() +
                "\nBonus : " + bonus() +
                "\nMaaş artışı : " + riseSalary() +
                "\nVergi ve Bonuslar ile birlikte maaş : " + (this.salary + calculatedBonus - calculatedTax) +
                "\nToplam maaş : " +(this.salary + calculatedBonus + calculatedRise - calculatedTax) );
    }
}
