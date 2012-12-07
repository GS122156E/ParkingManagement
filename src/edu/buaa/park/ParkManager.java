package edu.buaa.park;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: Lenovo-lb
 * Date: 12-12-5
 * Time: 下午6:13
 * To change this template use File | Settings | File Templates.
 */
public class ParkManager {

    private Map<ParkBoyInfo,ParkBoy> parkBoyMap = new HashMap<ParkBoyInfo, ParkBoy>();

    public void addParkBoy(ParkBoyInfo parkBoyInfo,ParkBoy parkBoy)
    {
        this.parkBoyMap.put(parkBoyInfo,parkBoy);
    }
    public ParkBoy getParkBoy(ParkBoyInfo parkBoyInfo)
    {
         return parkBoyMap.get(parkBoyInfo);
    }

    public Map<ParkBoyInfo, ParkBoy> getParkBoyMap() {
        return parkBoyMap;
    }

    /**
     * 显示停车仔报表
     */
    public void showParkingBoyReporter(ParkBoyInfo parkBoyInfo)
    {
        Integer allTotalCapacity = 0,allAvailableNum = 0;
        ParkBoy parkBoy = this.getParkBoy(parkBoyInfo);
        List<ParkPlaceExtInfo> parkPlaceExtInfos = parkBoy.getParkPlaces();
        println(0,parkBoyInfo.getParkBoyName());
        if(parkPlaceExtInfos != null && parkPlaceExtInfos.size()>0)
        {
            for(ParkPlaceExtInfo parkPlaceExtInfo:parkPlaceExtInfos)
            {

            }
        }

    }

    private void println(int spaceNum,String content)
    {
        for(int i = 0;i<spaceNum;i++)
           System.out.print(" ");
        System.out.println(content);
    }

}
