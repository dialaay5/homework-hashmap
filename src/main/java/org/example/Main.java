package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
        // exercise 1 : class MobilePhone
        // exercise 2 :
        MobilePhone samsung1 = new MobilePhone("050-2655651", "Galaxy C9 Pro", "6", 3.4f);
        MobilePhone samsung2 = new MobilePhone("050-2655651", "Galaxy C9 Pro", "6", 3.4f);
        MobilePhone samsung3 = new MobilePhone("052-4633576", "Galaxy C7 Pro", "6.2", 6.5f);
        MobilePhone samsung4 = new MobilePhone("050-7397418", "Galaxy S Light Luxury", "8", 8.1f);
        MobilePhone samsung5 = new MobilePhone("050-3663036", "S21", "7", 7.2f);

        System.out.printf("samsung1 hashcode = %d\n", samsung1.hashCode());
        System.out.printf("samsung2 hashcode = %d\n", samsung2.hashCode());

        System.out.printf("samsung1 & samsung2 are equals? %s\n", samsung1.equals(samsung2));

        //exercise 3 :
        HashMapp<String, MobilePhone> samsung_map = new HashMapp<>();
        samsung_map.put(samsung1.phone_number, samsung1);
        samsung_map.put(samsung2.phone_number, samsung2);
        samsung_map.put(samsung3.phone_number, samsung3);
        samsung_map.put(samsung4.phone_number, samsung4);
        samsung_map.put(samsung5.phone_number, samsung5);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.printf("[%s] : [%s] \n", phoneNumber, samsung_map.get(phoneNumber));

        // exercise 4 :
        ArrayList<MobilePhone> instanceList = new ArrayList<>();
        instanceList.add(samsung1);
        instanceList.add(samsung2);
        instanceList.add(samsung3);
        instanceList.add(samsung4);
        instanceList.add(samsung5);

        HashMapp<String, ArrayList<MobilePhone>> samsung_mapList = new HashMapp<>();
        samsung_mapList.put(samsung1.getModel(), getPhonesByModel(samsung1.getModel(), instanceList));
        samsung_mapList.put(samsung2.getModel(), getPhonesByModel(samsung2.getModel(), instanceList));
        samsung_mapList.put(samsung3.getModel(), getPhonesByModel(samsung3.getModel(), instanceList));
        samsung_mapList.put(samsung4.getModel(), getPhonesByModel(samsung4.getModel(), instanceList));
        samsung_mapList.put(samsung5.getModel(), getPhonesByModel(samsung5.getModel(), instanceList));

        System.out.print("Enter phone model: ");
        String phoneModel = scanner.nextLine();
        System.out.printf("[%s] : [%s] \n", phoneModel, samsung_mapList.get(phoneModel));

        //exercise 5 :
        HashMapp<Float, ArrayList<MobilePhone>> samsung_List = new HashMapp<>();
        samsung_List.put(samsung1.getSize(), getPhonesBySize(samsung1.getSize(), instanceList));
        samsung_List.put(samsung2.getSize(), getPhonesBySize(samsung2.getSize(), instanceList));
        samsung_List.put(samsung3.getSize(), getPhonesBySize(samsung3.getSize(), instanceList));
        samsung_List.put(samsung4.getSize(), getPhonesBySize(samsung4.getSize(), instanceList));
        samsung_List.put(samsung5.getSize(), getPhonesBySize(samsung5.getSize(), instanceList));

        System.out.print("Enter phone size: ");
        Float phoneSize = Float.valueOf(scanner.next());
        System.out.printf("[%s] : [%s] \n", phoneSize, samsung_List.get(phoneSize));

    }
    public static ArrayList<MobilePhone> getPhonesByModel(String modelToSearch ,ArrayList<MobilePhone> phones) {
        ArrayList<MobilePhone> phonesWithModel = new ArrayList<>();
        for (MobilePhone phone : phones) {
            if (phone.getModel().equals(modelToSearch)) {
                phonesWithModel.add(phone);
            }
        }
        return phonesWithModel;
    }

    public static ArrayList<MobilePhone> getPhonesBySize(Float sizeToSearch ,ArrayList<MobilePhone> phones) {
        ArrayList<MobilePhone> phonesWithSize = new ArrayList<>();
        for (MobilePhone phone : phones) {
            if (phone.getSize() == sizeToSearch) {
                phonesWithSize.add(phone);
            }
        }
        return phonesWithSize;
    }
}
