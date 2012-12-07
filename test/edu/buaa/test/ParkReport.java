package edu.buaa.test;

import edu.buaa.park.*;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Lenovo-lb
 * Date: 12-12-7
 * Time: 下午6:07
 * To change this template use File | Settings | File Templates.
 */
public class ParkReport {

    private List<ParkBoyInfo> parkBoys = null;

    @Before
    public void init()
    {
        parkBoys = new ArrayList<ParkBoyInfo>();
    }

    private ParkBoy init(String parkNo,String parkName,int maxParkingNum)
    {
        ParkPlaceExtInfo parkPlace=
                new ParkPlaceExtInfo(parkNo,parkName,maxParkingNum);
        ArrayList<ParkPlaceExtInfo> parkPlaces=new ArrayList<ParkPlaceExtInfo>();
        parkPlaces.add(parkPlace) ;
        return new ParkBoy(parkPlaces, new FirstAvailableParkStrategy());
    }

    @Test
    public void parkingboy_show_reporter()
    {
        Integer[] integers = new Integer[]{10,20,30,40};
        int index=0;
        ParkManager parkManager = new ParkManager();
        ParkBoyInfo parkBoyInfo=new ParkBoyInfo("boy1");
        parkManager.addParkBoy(parkBoyInfo,init("1001", "", integers[index++].intValue()));
        parkBoys.add(parkBoyInfo);

        parkBoyInfo=new ParkBoyInfo("boy2");
        parkManager.addParkBoy(parkBoyInfo,init("1002", "", integers[index++].intValue()));
        parkBoys.add(parkBoyInfo);

        index=0;
        //停车
        for(ParkBoyInfo parkBoyPerson:parkBoys)
        {
            Car car=new Car();
            ParkBoy parkBoy = parkManager.getParkBoy(parkBoyPerson);
            Ticket ticket = parkBoy.park(car);
            System.out.println((index+1)+"、"+(integers[index].intValue()-1)+":"+parkBoy.getAvailableNum());
            Assert.assertEquals(new Integer(integers[index++].intValue() - 1), parkBoy.getAvailableNum());
        }



    }


}
