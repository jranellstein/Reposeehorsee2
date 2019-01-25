package marsellj_assignment1;
/*
 * Name:  Justin Marsella
 * Assignment:  Assignment 1 Question 1
 * Program: Computer Programmer

 * This program takes a date that is entered and calculates the day 
 * of the week the date entered lies on, and outputs the full date.
 */
import java.util.Scanner;
public class Assign1_Q1 {
    public static void main(String[] args) {
        // These are the variables necessary for completing the program
        String month = "", weekDay = "", fullDate = "" ;
        String monName = "", dayString = "", yearString = "";
        int day = 0, year = 0, yearNum1 = 0, yearNum2 = 0, monNum = 0;
        double calc;
        //Scanner is initialized
        Scanner input = new Scanner(System.in);
        //User input will keep looping until a valid date is entered
        while(true){
            //This try catch block checks to make sure that you entered an
            //actual date, if not, reloops and prompts again
            try{
                //User is prompted to enter date (dd/mm/yyyy)
                System.out.println("Please enter the date (dd/mm/yyyy): ");
                fullDate = input.nextLine();
                //day, month, and year are substringed and/or parsed off
                //so that certain calculations and data validations can
                //be done
                dayString = fullDate.substring(0, 2);
                day = Integer.parseInt(dayString);
                month = fullDate.substring(3, 5);
                yearString = fullDate.substring(6, 10);
                year = Integer.parseInt(yearString);
            }
            catch(Exception e){
            }
            //As long as year entered is over 1900, the date entered will
            //be considered valid
            if(year >= 1900 && year <= 2019){
                //If conditions below are met, program will check February
                //dates including the 29th
                if((year % 4 == 0 || year % 400 == 0) && year % 100 != 0){
                    if(month.equalsIgnoreCase("02") && day >= 1 && day <= 29){
                        //The name of the month is declared here
                        monName = "February";
                        //The ID of the month necessary for the formula is 
                        //declared here
                        monNum = 12;
                        //year is converted to string and substringed off into
                        //to seperate numbers necessary for the formula
                        String temp = String.valueOf(year);
                        String temp1 = temp.substring(0, 2);
                        String temp2 = temp.substring(2, 4);
                        yearNum1 = Integer.parseInt(temp1);
                        yearNum2 = Integer.parseInt(temp2);
                        //The January and February months have the second half
                        //of the year number subtracted by 1, necessary for the
                        //formula
                        yearNum2 -= 1;
                        //Program breaks out of loop
                        break;
                    }
                }
                //If conditions above are not met, program will check February
                //dates not including the 29th
                else{
                    if(month.equalsIgnoreCase("02") && day >= 1 && day <= 28){
                        monName = "February";
                        monNum = 12;
                        String temp = String.valueOf(year);
                        String temp1 = temp.substring(0, 2);
                        String temp2 = temp.substring(2, 4);
                        yearNum1 = Integer.parseInt(temp1);
                        yearNum2 = Integer.parseInt(temp2);
                        yearNum2 -= 1;
                        break;
                    }
                }
                //Program will check through all these dates to see if what
                //user inputted matches any of the following dates below
                if(month.equalsIgnoreCase("01") && day >= 1 && day <= 31){
                    monName = "January";
                    monNum = 11;
                    String temp = String.valueOf(year);
                    String temp1 = temp.substring(0, 2);
                    String temp2 = temp.substring(2, 4);
                    yearNum1 = Integer.parseInt(temp1);
                    yearNum2 = Integer.parseInt(temp2);
                    yearNum2 -= 1;
                    break;
                }
                else if(month.equalsIgnoreCase("03") && day >= 1 && day <= 31){
                    monName = "March";
                    monNum = 1;
                    String temp = String.valueOf(year);
                    String temp1 = temp.substring(0, 2);
                    String temp2 = temp.substring(2, 4);
                    yearNum1 = Integer.parseInt(temp1);
                    yearNum2 = Integer.parseInt(temp2);
                    break;
                }
                else if(month.equalsIgnoreCase("04") && day >= 1 && day <= 30){
                    monName = "April";
                    monNum = 2;
                    String temp = String.valueOf(year);
                    String temp1 = temp.substring(0, 2);
                    String temp2 = temp.substring(2, 4);
                    yearNum1 = Integer.parseInt(temp1);
                    yearNum2 = Integer.parseInt(temp2);
                    break;
                }
                else if(month.equalsIgnoreCase("05") && day >= 1 && day <= 31){
                    monName = "May";
                    monNum = 3;
                    String temp = String.valueOf(year);
                    String temp1 = temp.substring(0, 2);
                    String temp2 = temp.substring(2, 4);
                    yearNum1 = Integer.parseInt(temp1);
                    yearNum2 = Integer.parseInt(temp2);
                    break;
                }
                else if(month.equalsIgnoreCase("06") && day >= 1 && day <= 30){
                    monName = "June";
                    monNum = 4;
                    String temp = String.valueOf(year);
                    String temp1 = temp.substring(0, 2);
                    String temp2 = temp.substring(2, 4);
                    yearNum1 = Integer.parseInt(temp1);
                    yearNum2 = Integer.parseInt(temp2);
                    break;
                }
                else if(month.equalsIgnoreCase("07") && day >= 1 && day <= 31){
                    monName = "July";
                    monNum = 5;
                    String temp = String.valueOf(year);
                    String temp1 = temp.substring(0, 2);
                    String temp2 = temp.substring(2, 4);
                    yearNum1 = Integer.parseInt(temp1);
                    yearNum2 = Integer.parseInt(temp2);
                    break;
                }
                else if(month.equalsIgnoreCase("08") && day >= 1 && day <= 31){
                    monName = "August";
                    monNum = 6;
                    String temp = String.valueOf(year);
                    String temp1 = temp.substring(0, 2);
                    String temp2 = temp.substring(2, 4);
                    yearNum1 = Integer.parseInt(temp1);
                    yearNum2 = Integer.parseInt(temp2);
                    break;
                }
                else if(month.equalsIgnoreCase("09") && day >= 1 && day <= 30){
                    monName = "September";
                    monNum = 7;
                    String temp = String.valueOf(year);
                    String temp1 = temp.substring(0, 2);
                    String temp2 = temp.substring(2, 4);
                    yearNum1 = Integer.parseInt(temp1);
                    yearNum2 = Integer.parseInt(temp2);
                    break;
                }
                else if(month.equalsIgnoreCase("10") && day >= 1 && day <= 31){
                    monName = "October";
                    monNum = 8;
                    String temp = String.valueOf(year);
                    String temp1 = temp.substring(0, 2);
                    String temp2 = temp.substring(2, 4);
                    yearNum1 = Integer.parseInt(temp1);
                    yearNum2 = Integer.parseInt(temp2);
                    break;
                }
                else if(month.equalsIgnoreCase("11") && day >= 1 && day <= 30){
                    monName = "November";
                    monNum = 9;
                    String temp = String.valueOf(year);
                    String temp1 = temp.substring(0, 2);
                    String temp2 = temp.substring(2, 4);
                    yearNum1 = Integer.parseInt(temp1);
                    yearNum2 = Integer.parseInt(temp2);
                    break;
                }
                else if(month.equalsIgnoreCase("12") && day >= 1 && day <= 31){
                    monName = "December";
                    monNum = 10;
                    String temp = String.valueOf(year);
                    String temp1 = temp.substring(0, 2);
                    String temp2 = temp.substring(2, 4);
                    yearNum1 = Integer.parseInt(temp1);
                    yearNum2 = Integer.parseInt(temp2);
                    break;
                }
            }
            //If an invalid date is entered, error message occurs and
            //user is prompted to input again
            else{
               System.out.println("What you entered is invalid, try again!"); 
            }
        }
        //Formula known as "Zellers Rule" is implemented to give us the 
        //necessary number that will be modded to give us the weekday
        calc = day + ((13*monNum-1)/5) + yearNum2 + (yearNum2/4) + (yearNum1/4) - (2*yearNum1);
        //If statements check to see which number is given when modding the 
        //calculated number above
        if(calc % 7 == 0){
            weekDay = "Sunday";
        }
        else if(calc % 7 == 1){
            weekDay = "Monday";
        }
        else if(calc % 7 == 2){
            weekDay = "Tuesday";
        }
        else if(calc % 7 == 3){
            weekDay = "Wednesday";
        }
        else if(calc % 7 == 4){
            weekDay = "Thursday";
        }
        else if(calc % 7 == 5){
            weekDay = "Friday";
        }
        else{
            weekDay = "Saturday";
        }
        //Final date is printed
        System.out.println("Exact date: " + weekDay + " " + monName + " " + day + ", " + year);
    }
}