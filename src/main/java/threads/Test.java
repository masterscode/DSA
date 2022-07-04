package threads;

import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

public class Test {

    public static void main(String[] args) {
        final String refCode = UUID.randomUUID().toString().replaceAll("-","").toUpperCase(Locale.ROOT);
//        buildHistory(List.of("emmanuel", "em", "james", "paul"), refCode);

        System.out.println(extract());
    }

    private static void buildHistory(List<String> names, String refCode) {
        names.stream().map(name -> Map.of(name, refCode)).forEach(System.out::println);
    }

    public static String extract(){
        String nin = "National Identity Management System Nim 7 ry Federal Republic of Nigeria : UIC National Identification Number Slip (NINS) Tracking ID: S7YOOOZMHOOOHFO Surname: IKPEFUA Address: [7 ASAJON WAY NIN: 34811543648 First Name: MICHAEL Middle Name: AKHIBEMUDU. Gender: M SANGOTEDO LA Note: The National Identification Number (NIN) is your identity. is confidential and may only be released for legitimate transactions. You will be notified when your National Identity Card is ready (for any enquiries please contact) & helpdesk@nimc.gov.ng = www.nimce.gov.ng z 0700-CALL-NIMC National Identity Management Commission (0700-2255-646) 11, Sokode Crescent, Off Dalaba Street, Zone 5 Wuse, Abuia Niaeria";
        String key = "NIN: ";
        int start = nin.indexOf(key);
        return nin.substring(start, start +key.length()+ 10);

    }

}