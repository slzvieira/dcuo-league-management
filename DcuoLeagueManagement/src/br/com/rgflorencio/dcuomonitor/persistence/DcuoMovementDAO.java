/*
 * @(#)DcuoMovementDAO.java 1.00 25/08/2015 Copyright 2015 CPA Consulting LTDA.
 * Todos os direitos reservados. CPA PROPRIETARY/CONFIDENTIAL.
 * Proibida a c�pia e-ou a reprodu��o deste c�digo.
 */
package br.com.rgflorencio.dcuomonitor.persistence;

import br.com.rgflorencio.dcuomonitor.model.DcuoMovement;

/**
 * TODO DOCUMENT ME!
 * @author sandro.vieira
 * @version 1.0, 25/08/2015 - sandro.vieira - Implementacao.
 */
public interface DcuoMovementDAO extends DAO {

    /**
     * TODO DOCUMENT ME!
     * @param movementName
     * @return
     * @throws DAOException
     */
    DcuoMovement findByName(String movementName) throws DAOException;

    /**
     * TODO DOCUMENT ME!
     * @param movement
     * @throws DAOException
     */
    DcuoMovement persist(DcuoMovement movement) throws DAOException;
}
