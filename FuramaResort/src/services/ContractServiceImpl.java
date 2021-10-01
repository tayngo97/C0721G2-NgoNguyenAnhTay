package services;

import models.person.Employee;
import models.service.*;
import utils.ContractToCsv;

import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

public class ContractServiceImpl implements ContractService {
    protected static File contractFile = new File("C:\\C0721G2_NgoNguyenAnhTay\\FuramaResort\\src\\data\\contract.csv");
    protected static Queue<Contract> listContracts = new ArrayDeque<>();
    protected static Scanner scanner = new Scanner(System.in);


    @Override
    public void CreateNewContracts() {
        boolean flag = true;
        Queue<Booking> bookingQueue = BookingServiceImpl.changeSetToQueue();
        Queue<Contract> listContracts1 = ContractToCsv.readDataFromFile();
        for (Booking booking: bookingQueue) {
            for (Contract contract: listContracts1) {
                if (booking.getBookingID().equals(contract.getBookingID().getBookingID()) || booking.getFacility() instanceof Room){
                    bookingQueue.remove(booking);
                }
            }
        }

        System.out.println("List booking have no contract:");
        System.out.println(bookingQueue.size());
        for (Booking booking : bookingQueue) {
            while (flag) {
                flag = false;
                try {
                    getFacility(booking.getFacility(), booking);
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
        Queue<Contract> listContracts1 = ContractToCsv.readDataFromFile();
        int i = 0;
        for (Contract element : listContracts1) {
            System.out.println(++i + "=> " + element);
        }
    }

    public void deleleContract() {
        Queue<Contract> listContracts1 = ContractToCsv.readDataFromFile();
        System.out.println("Enter contractID to delete:");
        String contractId = scanner.nextLine();
        listContracts1.removeIf(contract -> contract.getContractID().equals(contractId));
        for (Contract contract:listContracts1) {
            System.out.println(contract);
        }
        ContractToCsv.writeToFile(listContracts1);
    }

    @Override
    public void EditContracts() {
        Queue<Contract> listContracts = ContractToCsv.readDataFromFile();
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
        }
        ContractToCsv.writeToFile(listContracts);
    }

    public void getFacility(Facility facility, Booking booking) {
        System.out.println(booking.toString());
        System.out.println("Enter contractID");
        String contractID = scanner.nextLine();
        System.out.println("Enter depositAmount");
        int depositAmount = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter totalPayment");
        int totalPayment = Integer.parseInt(scanner.nextLine());
        Contract contract = new Contract(contractID, booking, depositAmount, totalPayment);
        if (facility instanceof Villa) {
            if (contractFile.length() > 0) {
                listContracts = ContractToCsv.readDataFromFile();
            }
            listContracts.add(contract);
            ContractToCsv.writeToFile(listContracts);
        } else if (facility instanceof House) {
            if (contractFile.length() > 0) {
                listContracts = ContractToCsv.readDataFromFile();
            }
            listContracts.add(contract);
            ContractToCsv.writeToFile(listContracts);
        }
    }
}




