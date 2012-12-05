package edu.buaa.park;

import java.util.HashMap;
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
}
