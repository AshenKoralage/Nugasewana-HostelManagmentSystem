/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bo;

import bo.custom.FacilityBO;
import bo.custom.HostelBO;
import bo.custom.impl.FacilityBOImpl;
import bo.custom.impl.FacilityTypeBOImpl;
import bo.custom.impl.HostelBOImpl;
import bo.custom.impl.LoginBOImpl;
import bo.custom.impl.KeyMoneyBOImpl;
import bo.custom.impl.MonthlyPaymentBOImpl;
import bo.custom.impl.RegistrationBOImpl;
import bo.custom.impl.Reservation2BOImpl;
import bo.custom.impl.ReservationBOImpl;
import bo.custom.impl.RoomBOImpl;
import bo.custom.impl.TypeBOImpl;
import entity.Type;

/**
 *
 * @author Ashen Koralage
 */
public class BOFactory {

    private static BOFactory bOFactory;

    public BOFactory() {
    }

    public static BOFactory getInstance() {
        if (bOFactory == null) {
            bOFactory = new BOFactory();
        }
        return bOFactory;
    }

    public enum BOTypes {
        ROOM, HOSTEL, TYPE, FACILITY, REGISTRATION, LOGIN, FACILITYTYPE, RESERVATION, RESERVATION2, PAYMENTS, MONTHLYPAYMENT;
    }

    public SuperBO getBO(BOTypes types) {
        switch (types) {
            case ROOM:
                return (SuperBO) new RoomBOImpl();
            case HOSTEL:
                return (SuperBO) new HostelBOImpl();
            case TYPE:
                return (SuperBO) new TypeBOImpl();
            case FACILITY:
                return new FacilityBOImpl();
            case REGISTRATION:
                return new RegistrationBOImpl();
            case LOGIN:
                return (SuperBO) new LoginBOImpl();
            case FACILITYTYPE:
                return (SuperBO) new FacilityTypeBOImpl();
            case RESERVATION:
                return new ReservationBOImpl();
            case RESERVATION2:
                return new Reservation2BOImpl();
            case PAYMENTS:
                return (SuperBO) new KeyMoneyBOImpl();
            case MONTHLYPAYMENT:
                return (SuperBO) new MonthlyPaymentBOImpl();
            default:
                return null;
        }

    }

}
