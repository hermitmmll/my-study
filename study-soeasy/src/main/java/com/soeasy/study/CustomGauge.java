package com.soeasy.study;

import com.codahale.metrics.Gauge;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:hermit
 * CreateDate:18/1/13
 */
public class CustomGauge<T> implements Gauge {

    /**
     * Returns the metric's current value.
     *
     * @return the metric's current value
     */
    @Override
    public Object getValue() {
        return null;
    }

    public Object getName () {
        return null;
    }




    public static void main (String []args) {
        String str = "280,6399,181,167,272,111,278,160,59.17,480.74,0,84.40,98.00,62.33,244.29,205.00,0,1,0,0,0,0,0,0,0.0,0.0,4,267,22,65,0.01,37,0.14,NULL,NULL,1,2,1,1,NULL,NULL,NULL,NULL,0.21,1,2,3,5,0.75,1,1,0,0,0.00,0,0,0,0,0.00,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,0.00,NULL,NULL,0.00,NULL,NULL,13,0,65,163,43,0.26380368098159507,8,4,0,0,0,0,3,2,0,id_card_court_blacklist_0,id_card_financial_blacklist_0,age_2,male,cell_phone_check_name_1,cell_phone_check_idcard_2,NULL,NULL,cell_phone_financial_blacklist_0,home_addr_check_addr_0,NULL,NULL,NULL,NULL,417,860,2,152,\"无该类号码记录\",\"未找到信用卡类相关号码\",\"无通话记录\",\"未发现澳门地区电话通话记录\",\"偶尔夜间活动(夜间通话比例20%-50%， 包含20%)\",\"晚间活跃频率占全天的20.87%\",\"无数据\",\"未提供电商数据\",\"无数据\",\"未提供电商数据\",\"152天内有1天无通话记录\",\"根据运营商详单数据，连续三天以上无通话记录0次\",\"朋友圈主要活跃在浙江地区(非居住地)\",\"浙江地区通话时间占比为84.61%\",\"无数据\",\"未提供电商数据\",\"无数据\",\"未提供电商数据\",\"偶尔通话(3次以内，包括3次)\",\"与110号码通话1次，共2.18333333333分钟\",\"数量正常(10-100)\",\"互通过电话的号码有37个，比例为13.86%\",\"很少被联系(联系次数在5次以内，或联系次数在5次以上且主动呼叫占比低于20%)\",\"联系列表:借贷宝主叫1次共2.52分钟，被叫0次共0.0分钟;平安易贷主叫0次共0.0分钟，被叫1次共2.68分钟;拍拍贷主叫1次共1.98分钟，被叫0次共0.0分钟;掌众金融主叫1次共2.07分钟，被叫0次共0.0分钟\",\"偶尔通话(3次以内，包括3次)\",\"与120号码通话1次，共1.71666666667分钟\",\"很少被联系(联系次数在5次以内，或联系次数在5次以上且主动呼叫占比低于20%)\",\"联系列表:广发银行(德胜支行)主叫0次共0.0分钟，被叫1次共1.75分钟\",\"无通话记录\",\"未发现与律师电话通话记录\",\"长期使用(24个月以上，包含24)\",\"根据号码15067103752运营商提供的认证时间，推算该号码使用65个月\",\"无通话记录\",\"未发现与法院电话通话记录\",\"无数据\",\"未提供电商数据\",\"无数据\",\"未提供电商数据\",5,700000,null,5000.0,27,5,6217231202001307963,3209928,362330199412297154,15067103752,2017010110142600001";

        String str2 = "sms_cnt_avg,net_flow_avg,total_amount_avg,call_out_time_avg,call_cnt_avg,call_out_cnt_avg,call_in_time_avg,call_in_cnt_avg,sms_cnt_ratio,net_flow_ratio,total_amount_ratio,call_out_time_ratio,call_cnt_ratio,call_out_cnt_ratio,call_in_time_ratio,call_in_cnt_ratio,trip_info_size,collection_contact_size,collection_contact_total_amount,collection_contact_total_count,ebusiness_expense_size,ebusiness_expense_all_count,ebusiness_expense_all_amount,deliver_address_size,deliver_address_total_amount,deliver_address_total_count,main_service_type_cnt,contact_list_size,contact_region_size,phone_used_time,phone_silent_ratio,contact_each_other,contact_each_other_ratio,conatct_macao_times,conatct_macao_minutes,contact_110_times,contact_110_minutes,contact_120_times,contact_120_minutes,contact_lawyer_times,contact_lawyer_minutes,contact_court_times,contact_court_minutes,contact_night_ratio,contact_loan_callin_times,contact_loan_callin_minutes,contact_loan_callout_times,contact_loan_callout_minutes,contact_loan_callout_ratio,contact_bank_callin_times,contact_bank_callin_minutes,contact_bank_callout_times,contact_bank_callout_minutes,contact_bank_callout_ratio,contact_creditcard_callin_times,contact_creditcard_callin_minutes,contact_creditcard_callout_times,contact_creditcard_callout_minutes,contact_creditcard_callin_ratio,dwell_used_time,ebusiness_info_duration,ebusiness_info_times,ebusiness_info_amount,person_ebusiness_info_duration,person_ebusiness_info_times,person_ebusiness_info_amount,virtual_buying_times,virtual_buying_amount,virtual_buying_ratio,lottery_buying_times,lottery_buying_amount,lottery_buying_ratio,person_addr_cnt,person_addr_changed,phone_gray_score,contacts_class1_blacklist_cnt,contacts_class2_blacklist_cnt,contacts_class1_cnt,contacts_router_cnt,contacts_router_ratio,searched_org_cnt,searched_org_type_cnt,idcard_with_other_names,idcard_with_other_phones,phone_with_other_names,phone_with_other_idcards,register_org_cnt,register_org_type_cnt,arised_open_web_cnt,id_card_court_blacklist,id_card_financial_blacklist,age,sex,cell_phone_check_name,cell_phone_check_idcard,cell_phone_check_ebusiness_times,cell_phone_check_ebusiness_months,cell_phone_financial_blacklist,home_addr_check_addr,home_addr_check_ebusiness_months,home_addr_check_ebusiness_times,check_mobile_times,check_mobile_minutes,contact_contacttimes,contact_contactminutes,contact_contactrank,phone_use_silence_time,contact_credit_card_result,contact_credit_card_evidence,contact_macao_result,contact_macao_evidence,contact_night_result,contact_night_evidence,dwell_used_time_result,dwell_used_time_evidence,person_addr_changed_result,person_addr_changed_evidence,phone_silent_result,phone_silent_evidence,regular_circle_result,regular_circle_evidence,person_ebusiness_info_result,person_ebusiness_info_evidence,virtual_buying_result,virtual_buying_evidence,contact_110_result,contact_110_evidence,contact_each_other_result,contact_each_other_evidence,contact_loan_result,contact_loan_evidence,contact_120_result,contact_120_evidence,contact_bank_result,contact_bank_evidence,contact_lawyer_result,contact_lawyer_evidence,phone_used_time_result,phone_used_time_evidence,contact_court_result,contact_court_evidence,ebusiness_info_result,ebusiness_info_evidence,lottery_buying_result,lottery_buying_evidence,loanNum,loanAmount,zhimaScore,monthInCome,positionLevel,educSign,bankCard,uid,idCard,mobile,loanId";

        System.out.println(str.split(",").length);

        for (String s:str.split(",")) {
            System.out.println(s);
        }


    }
}
