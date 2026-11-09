package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Room room = new Room(2, 99.99, false, false);
        System.out.println("Beds " + room.getNumberOfBeds());
        System.out.println("Price " + room.getPrice());
        System.out.println("Occupied " + room.isOccupied());
        System.out.println("Dirty " + room.isDirty());
        System.out.println("Available " + room.isAvailable());

        Reservation reservation = new Reservation("king", 7, true);
        System.out.println("Room Type " + reservation.getRoomType());
        System.out.println("Number of Nights" + reservation.getNumberOfNights());
        System.out.println("Weekend " + reservation.isWeekend());
        System.out.println("Price " + reservation.getPrice());
        System.out.println("Reservation Total " + reservation.getReservationTotal());

        Employee employee = new Employee(1, "TZ", "CS", 29.32, 42);
        System.out.println("Employee ID " + employee.getEmployeeId());
        System.out.println("Name " + employee.getName());
        System.out.println("Department " + employee.getDepartment());
        System.out.println("Pay Rate " + employee.getPayRate());
        System.out.println("Hours Worked " + employee.getHoursWorked());
        System.out.println("Regular Hours " + employee.getRegularHours());
        System.out.println("Overtime Hours " + employee.getOvertimeHours());
        System.out.println("Total Pay " + employee.getTotalPay());
    }
}
