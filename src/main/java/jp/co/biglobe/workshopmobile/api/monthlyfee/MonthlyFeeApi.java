package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.plan.Contract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MonthlyFeeApi {
//    @Autowired
//    MonthlyFeeService service;

    @RequestMapping(value = "/monthly-fee", method = RequestMethod.GET)
    public Map invoke(
            Request request
    ) {
        Map<String, Object> res = new HashMap<>();
        Contract contract = new Contract(request.getPlan().convertToDomainPlan(), request.convertToDomainEntameFreeOption());
        res.put("monthly_fee", contract.calculateMonthlyFee().getValue());
//        res.put("monthly_fee", service.calculate(request.getPlan().getPlan(), request.convertToDomainEntameFreeOption()));
        return res;
    }

}
