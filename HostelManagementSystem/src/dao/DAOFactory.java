/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dao.custom.RoomDAO;
import dao.custom.HostelDAO;
import dao.custom.RegistrationDAO;
import dao.custom.impl.FacilityDAOImpl;
import dao.custom.impl.FacilityTypeDAOImpl;
import dao.custom.impl.HostelDAOImpl;
import dao.custom.impl.LoginDAOImpl;
import dao.custom.impl.KeyMoneyDAOImpl;
import dao.custom.impl.MonthlyPaymentDAOImpl;
import dao.custom.impl.QueryDAOImpl;
import dao.custom.impl.RegistrationDAOImpl;
import dao.custom.impl.Reservation2DAOImpl;
import dao.custom.impl.RoomDAOImpl;
import dao.custom.impl.TypeDAOImpl;

/**
 *
 * @author Ashen Koralage
 */
public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public static DAOFactory getInstance() {
        if (daoFactory == null) {
            daoFactory = new DAOFactory();
        }
        return daoFactory;
    }

    public enum DAOTypes {
        ROOM, HOSTEL, TYPE, FACILITY, REGISTRATION, LOGIN, FACILITYTYPE, QUERYDAO, RESERVATION2, PAYMENTS, MONTHLYPAYMENT;
    }

    public SuperDAO getDAO(DAOTypes types) {

        switch (types) {
            case ROOM:
                return (SuperDAO) new RoomDAOImpl();
            case HOSTEL:
                return (SuperDAO) new HostelDAOImpl();
            case TYPE:
                return new TypeDAOImpl();
            case FACILITY:
                return new FacilityDAOImpl();
            case REGISTRATION:
                return (SuperDAO) new RegistrationDAOImpl();
            case LOGIN:
                return (SuperDAO) new LoginDAOImpl();
            case FACILITYTYPE:
                return new FacilityTypeDAOImpl();
            case QUERYDAO:
                return new QueryDAOImpl();
            case RESERVATION2:
                return new Reservation2DAOImpl();
            case PAYMENTS:
                return new KeyMoneyDAOImpl();
            case MONTHLYPAYMENT:
                return (SuperDAO) new MonthlyPaymentDAOImpl();
            default:
                return null;
        }

    }
}
