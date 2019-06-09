package jp.co.biglobe.workshopmobile.api.monthlyfee;

import jp.co.biglobe.workshopmobile.domain.fee.MonthlyFee;
import jp.co.biglobe.workshopmobile.domain.plan.Contract;
import jp.co.biglobe.workshopmobile.domain.plan.EntameFreeOption;
import jp.co.biglobe.workshopmobile.domain.plan.Plan;
import org.springframework.stereotype.Service;

@Service
public class MonthlyFeeService {

    public MonthlyFee calculate(Plan plan, EntameFreeOption entameFreeOption) {
        Contract contract = new Contract(plan, entameFreeOption);
        return contract.calculateMonthlyFee();
    }
}
