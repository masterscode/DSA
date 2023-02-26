import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        IntStream.rangeClosed(1, 100)
        .parallel().filter(n -> (n % 2) == 0)
        .forEach(numbers::add);
        
    //    System.out.println(numbers);

        System.out.println(
                negSubstring("emmanuel")
        );

    }

    public static String negSubstring(String str){

        StringBuilder result = new StringBuilder();
        String s = "";
        for (int i = 1; i <= str.length() && str.length() - i >= 0 ; i++) {
            if (result.length() == 10 ) break;
            int index = str.length()  - i;
            result.append(str.charAt(index));
            s = Character.toString(str.charAt(index)).concat(s);

        }
        return  s; //result.toString();
    }

    public static int sumSuccession(List<Integer> nums) {
        int sum = 0;
        for (int i = 0; i < nums.size(); i++) {
            boolean even = i % 2 == 0;
            int num = even ? nums.get(i) : -1 * nums.get(i);
            sum+= num;
        }
        return sum;
    }
}


/*
 *     @Override
    public MedusaMerchantResponse setMerchantPin(ForgotPinDto request) {
            Merchants loggedInMerchant = getLoggedInMerchant();

            loggedInMerchant.setPin(request.getPin());
            merchantRepository.save(loggedInMerchant);
            return responseHelper.getResponse(SUCCESS_CODE, SUCCESS, "", HttpStatus.OK);
    }

    @Override
    public MedusaMerchantResponse changeMerchantPin(ChangePinDto changePinDto){

        final Merchants loggedInMerchant = getLoggedInMerchant();
        if (!changePinDto.getOldPin().equals(loggedInMerchant.getPin()))
                return responseHelper.getResponse(EXPECTATION_FAILED_CODE, EXPECTATION_FAILED, "", HttpStatus.EXPECTATION_FAILED);

        loggedInMerchant.setPin(changePinDto.getNewPin());
        merchantRepository.save(loggedInMerchant);

        return responseHelper.getResponse(SUCCESS_CODE, SUCCESS, "Pin changed successfully", HttpStatus.ACCEPTED);
    }

    @Override
    public MedusaMerchantResponse validateMerchantPin(ValidatePinDto pinDto){
        Merchants loggedInMerchant = getLoggedInMerchant();
        if(!loggedInMerchant.getPin().equals(pinDto.getPin())) throw new NoResultException("Pin incorrect");

        return responseHelper.getResponse(SUCCESS_CODE, SUCCESS, "Correct pin", HttpStatus.OK);
    }

    private Merchants getLoggedInMerchant(){
        final Authentication authentication = Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication()).orElseThrow(()-> new SecurityException("Authentication failed"));
        return merchantRepository.findMerchantByUsername(authentication.getName()).orElseThrow(() -> new EntityNotFoundException("user not found"));
    }
 */