package services;

import models.service.Booking;
import models.service.Contract;
import models.service.House;
import models.service.Villa;

import java.text.DecimalFormat;
import java.util.*;

public class ContractServiceImpl implements ContractService {
    protected static TreeSet<Booking> bookinglist = BookingServiceImpl.bookingTreeSet;
    protected static ArrayDeque<Booking> bookingQueue = new ArrayDeque<>();
    protected static ArrayDeque<Contract> listContracts = new ArrayDeque<>();
    private Scanner scanner = new Scanner(System.in);

    static {
        for (Booking e : bookinglist) {
            bookingQueue.offer(e);
        }
    }

    @Override
    public void CreateNewContracts() {
        for (Booking booking : bookingQueue) {
            boolean flag = true;
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
                        listContracts.add(contract);
                    } else if (booking.getFacilityName() instanceof House) {
                        System.out.println( booking.toString());
                        System.out.println("Enter contractID");
                        String contractID = scanner.nextLine();
                        System.out.println("Enter depositAmount");
                        int depositAmount = Integer.parseInt(scanner.nextLine());
                        System.out.println("Enter totalPayment");
                        int totalPayment = Integer.parseInt(scanner.nextLine());
                        scanner.nextLine();
                        Contract contract = new Contract(contractID, booking, depositAmount, totalPayment);
                        listContracts.add(contract);
                    }
                } catch (Exception e) {
                    System.err.println("Invalid input");
                    flag = true;
                }
            }
        }
    }


        @Override
        public void DisplayListContracts () {
            int i = 0;
            for (Contract element : listContracts) {
                if (element == null) {
                    break;
                } else System.out.println(++i + "=> " + element);
            }
        }

        @Override
        public void EditContracts () {
            System.out.println("Enter id to search contract :");
            String id = scanner.nextLine();
            for (Contract contract : listContracts) {
                if (contract.getContractID().contains(id)) {
                    System.out.println(contract);
                    boolean flag = true;
                        while (flag){
                            flag = false;
                            try {
                                System.out.println("1.Edit contractID" + "\n" + "2.Edit depositAmount " + "\n" + "3.Edit totalPayment"+ "\n" + "0.Exit");
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
                            }catch (Exception e){
                                System.err.println("Invalid input");
                                flag = true;
                            }
                        }
                    }
                }
            }
        }




