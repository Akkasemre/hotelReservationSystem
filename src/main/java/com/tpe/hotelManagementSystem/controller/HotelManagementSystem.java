package com.tpe.hotelManagementSystem.controller;

import java.util.Scanner;

public class HotelManagementSystem {

    private static Scanner scanner;

    public static void displayMenuHotelManagementSystem() {
        scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            System.out.println("==== Hotel Management System  Menu ====");
            System.out.println("1. Hotel Operations");
            System.out.println("2. Room Operations");
            System.out.println("3. Guest Operations");
            System.out.println("4. Reservation Operations");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    displayHotelOperationsMenu();
                    break;
                case 2:
                    displayRoomOperationsMenu();
                    break;
                case 3:
                    displayGuestOperationsMenu();
                    break;
                case 4:
                    displayReservationOperationsMenu();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Good Bye");
                    break;
                default:
                    System.out.println("Invalid Choice Please try again");
                    break;
            }
        }


    }

    private static void displayHotelOperationsMenu() {
        System.out.println("==== Hotel Operations ====");
        System.out.println("1. Add a new hotel");
        System.out.println("2. Find Hotel By ID");
        System.out.println("3. Delete Hotel By ID");
        System.out.println("4. Find All Hotels");
        System.out.println("5. Update Hotel By ID");
        System.out.println("6. Return to Main Menu");
        System.out.print("Enter your choice: ");
        int hotelChoice = scanner.nextInt();
        scanner.nextLine();

        switch (hotelChoice) {
            case 1:
                //addNewHotel();
                break;
            case 2:
                //findHotelById();
                break;
            case 3:
                //deleteHotelById();
                break;
            case 4:
                //findAllHotels();
                break;
            case 5:
                //updateHotelById();
                break;
            case 6:
                //returnMainMenu();
                break;
            default:
                System.out.println("Invalid choice try again");
                break;
        }
    }

    private static void displayRoomOperationsMenu() {
        System.out.println("==== Room Operations ====");
        System.out.println("1. Add a new room");
        System.out.println("2. Find Room By ID");
        System.out.println("3. Delete Room By ID");
        System.out.println("4. Find All Rooms");
        System.out.println("5. Return to Main Menu");
        System.out.print("Enter your choice: ");
        int roomChoice = scanner.nextInt();
        scanner.nextLine();
        switch (roomChoice) {
            case 1:
                //addNewRoom();
                break;
            case 2:
                //findRoomById();
                break;
            case 3:
                //deleteRoomById();
                break;
            case 4:
                //findAllRooms();
                break;
            case 5:
                //returnMainMenu();
                break;
            default:
                System.out.println("Invalid choice try again");
                break;
        }

    }

    private static void displayGuestOperationsMenu() {
        System.out.println("==== Guest Operations ====");
        System.out.println("1. Add a new guest");
        System.out.println("2. Find Guest By ID");
        System.out.println("3. Delete Guest By ID");
        System.out.println("4. Find All Guests");
        System.out.println("5. Return to Main Menu");
        System.out.print("Enter your choice: ");
        int guestChoice = scanner.nextInt();
        scanner.nextLine();


        switch (guestChoice) {
            case 1:
                //addNewGuest();
                break;
            case 2:
                //findGuestById();
                break;
            case 3:
                //deleteGuestById();
                break;
            case 4:
                //findAllGuests();
                break;
            case 5:
                //returnMainMenu();
                break;
            default:
                System.out.println("Invalid choice try again");
                break;
        }

    }

    private static void displayReservationOperationsMenu() {
        System.out.println("==== Reservation Operations ====");
        System.out.println("1. Add a new reservation");
        System.out.println("2. Find Reservation By ID");
        System.out.println("3. Find All Reservations");
        System.out.println("4. Delete Reservation By ID");
        System.out.println("5. Return to Main Menu");
        System.out.print("Enter your choice: ");
        int reservationChoice = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Reservation Operation Menu");
        switch (reservationChoice) {
            case 1:
                //addNewReservation();
                break;
            case 2:
                //findReservationById();
                break;
            case 3:
                //findReservationById();
                break;
            case 4:
                //deleteReservationById();
                break;
            case 5:
                //returnMainMenu();
                break;
            default:
                System.out.println("Invalid choice try again");
                break;
        }
    }
}
