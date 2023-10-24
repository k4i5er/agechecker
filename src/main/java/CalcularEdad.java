import java.util.ArrayList;
public class CalcularEdad {
    static ArrayList<Integer> elapsedTime;

    public static ArrayList<Integer> calcular(Integer presentDay, Integer presentMonth, Integer presentYear, Integer birthDay, Integer birthMonth, Integer birthYear,
                                              Integer elapsedDay, Integer elapsedMonth, Integer elapsedYear, Boolean leapYear) {
        if (presentMonth > birthMonth || presentMonth == birthMonth && presentDay > birthDay) {
            elapsedYear = presentYear - birthYear;
            elapsedMonth = presentMonth - birthMonth;
            elapsedDay = presentDay - birthDay;
            elapsedTime.add(elapsedYear);
            elapsedTime.add(elapsedMonth);
            elapsedTime.add(elapsedDay);
            return elapsedTime;
        }
        else{
            elapsedYear = presentYear - birthYear - 1;
            elapsedMonth = 12 - (birthMonth - presentMonth);
            elapsedTime.add(elapsedYear);
            elapsedTime.add(elapsedMonth);
            if (birthMonth == 1 || birthMonth == 3 || birthMonth == 5 || birthMonth == 7 || birthMonth == 8 || birthMonth == 10 || birthMonth == 12){
                elapsedDay = 31 - (presentDay - birthDay);
                elapsedTime.add(elapsedDay);
                return elapsedTime;
            }
            else if (birthMonth == 2){
                if (leapYear){
                    elapsedDay = 29 - (presentDay - birthDay);
                    elapsedTime.add(elapsedDay);
                    return elapsedTime;
                }
                else{
                    elapsedDay = 28 - (presentDay - birthDay);
                    elapsedTime.add(elapsedDay);
                    return elapsedTime;
                }
            }
            else{
                elapsedDay = 30 - (presentDay - birthDay);
                elapsedTime.add(elapsedDay);
                return elapsedTime;
            }
        }
    }
}