import pojo.*;
import service.*;
import service.impl.*;

import java.util.List;

//测试
public class TestSelectAll {
    public static void main(String[] args) {
        //Staff
        StaffService staffService=new StaffServiceImpl();
        List<Staff> staff = staffService.selectAll();
        System.out.println(staff);


        //NursingRecord
        NursingRecordService nursingRecordService=new NursingRecordServiceImpl();
        List<NursingRecord> nursingRecords = nursingRecordService.selectAll();
        System.out.println(nursingRecords);


        //NursingLevel
        NursingLevelService nursingLevelService=new NursingLevelServiceImpl();
        List<NursingLevel> nursingLevels = nursingLevelService.selectAll();
        System.out.println(nursingLevels);


        //FoodRecord
        FoodRecordService foodRecordService=new FoodRecordServiceImpl();
        List<FoodRecord> foodRecords = foodRecordService.selectAll();
        System.out.println(foodRecords);

//        Customer
        CustomerService customerService= new CustomerServiceImpl();
        List<Customer> customers = customerService.selectAll();
        System.out.println(customers);


//        CustomerGoOut
        CustomerGoOutService customerGoOutService=new CustomerGoOutServiceImpl();
        List<CustomerGoOut> customerGoOuts = customerGoOutService.selectAll();
        System.out.println(customerGoOuts);


//        CustomerCheckOutMapper
        CustomerCheckOutService customerCheckOutService=new CustomerCheckOutServiceImpl();
        List<CustomerCheckOut> customerCheckOuts = customerCheckOutService.selectAll();
        System.out.println(customerCheckOuts);

//        CustomerCheckIn
        CustomerCheckInService customerCheckInService=new CustomerCheckInServiceImpl();
        List<CustomerCheckIn> customerCheckIns = customerCheckInService.selectAll();
        System.out.println(customerCheckIns);


//        Bed
        BedService bedService= new BedServiceImpl();
        List<Bed> beds = bedService.selectAll();
        System.out.println(beds);

    }
}
