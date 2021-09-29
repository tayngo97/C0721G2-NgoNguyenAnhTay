package services;

import models.person.Employee;
import models.service.*;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class ContractServiceImpl implements ContractService {
    protected static File contractFile = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\contract.csv");
    protected static Queue<Booking> bookingQueue = BookingServiceImpl.changeSetToQueue();
    protected static Queue<Contract> listContracts = new ArrayDeque<>();
    protected static Scanner scanner = new Scanner(System.in);


    @Override
    public void CreateNewContracts() {
        boolean flag = true;
        bookingQueue.forEach(System.out::println);
        System.out.println("Enter bookingID to create contract :");
        String bookingId = scanner.nextLine();

        for (Booking booking : bookingQueue) {
            if (!booking.getBookingID().equals(bookingId) || booking.getFacilityName() instanceof Room) {
                flag = false;
            }
            while (flag) {
                flag = false;
                try {
                    if (booking.getFacilityName() instanceof Villa) {
                        System.out.println(booking.toString());
                        System.out.println("Enter contractID");
                        String contractID = (scanner.nextLine());
                        System.out.println("Enter depositAmount");
                        int depositAmount = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter totalPayment");
                        int totalPayment = Integer.parseInt(scanner.nextLine());
                        Contract contract = new Contract(contractID, booking, depositAmount, totalPayment);
                        if (contractFile.length() > 0) {
                            listContracts = readDataFromFile();
                        }
                        listContracts.add(contract);
                        writeToFile(listContracts);
                    } else if (booking.getFacilityName() instanceof House) {
                        System.out.println(booking.toString());
                        System.out.println("Enter contractID");
                        String contractID = scanner.nextLine();
                        System.out.println("Enter depositAmount");
                        int depositAmount = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter totalPayment");
                        int totalPayment = Integer.parseInt(scanner.nextLine());
                        Contract contract = new Contract(contractID, booking, depositAmount, totalPayment);
                        if (contractFile.length() > 0) {
                            listContracts = readDataFromFile();
                        }
                        listContracts.add(contract);
                        writeToFile(listContracts);
                    }
                } catch (Exception e) {
                    System.err.println("Invalid input");
                    flag = true;

                }
            }
            flag = true;
        }
    }

    @Override
    public void DisplayListContracts() {
        listContracts = readDataFromFile();
        int i = 0;
        for (Contract element : listContracts) {
            if (element == null) {
                break;
            } else System.out.println(++i + "=> " + element);
        }
    }

    public  void deleleContract() {
        listContracts = readDataFromFile();
        System.out.println("Enter contractID to delete:");
        String contractId = scanner.nextLine();
        listContracts.removeIf(contract -> contract.getContractID().equals(contractId));
        listContracts.forEach(System.out::println);
        writeToFile(listContracts);
    }

    @Override
    public void EditContracts() {
        listContracts = readDataFromFile();
        System.out.println("Enter id to edit contract :");
        String id = scanner.nextLine();
        for (Contract contract : listContracts) {
            if (contract.getContractID().contains(id)) {
                System.out.println(contract);
                boolean flag = true;
                while (flag) {
                    flag = false;
                    try {
                        System.out.println("1.Edit contractID" + "\n" + "2.Edit depositAmount " + "\n" + "3.Edit totalPayment" + "\n" + "0.Exit");
                        int choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                System.out.println("Enter new contractID");
                                String id1 = scanner.nextLine();
                                contract.setContractID(id1);
                                break;
                            case 2:
                                System.out.println("Enter new depositAmount");
                                contract.setDepositAmount(Integer.parseInt(scanner.nextLine()));
                                break;
                            case 3:
                                System.out.println("Enter new totalPayment");
                                contract.setTotalPayment(Integer.parseInt(scanner.nextLine()));
                                break;
                            case 0:
                                flag = false;
                                break;
                            default:
                                System.err.println("Invalid input !");
                        }
                    } catch (Exception e) {
                        System.err.println("Invalid input");
                        flag = true;
                    }
                }
            }
        } writeToFile(listContracts);
    }

    public static Queue<Contract> readDataFromFile() {
        Queue<Contract> contracts = new ArrayDeque<>();
        try {
            FileInputStream fis = new FileInputStream(contractFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            contracts = (Queue<Contract>) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            System.out.println("File is empty");
        }
        return contracts;
    }

    public static void writeToFile(Queue<Contract> contracts) {
        try {
            FileOutputStream fos = new FileOutputStream(contractFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(contracts);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}




