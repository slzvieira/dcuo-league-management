/*
 * @(#)DcuoCharacterDAO.java 1.00 25/08/2015 Copyright 2015 CPA Consulting LTDA.
 * Todos os direitos reservados. CPA PROPRIETARY/CONFIDENTIAL.
 * Proibida a c�pia e-ou a reprodu��o deste c�digo.
 */
package br.com.rgflorencio.dcuomonitor.dao.dcuo;

import java.util.Date;
import java.util.List;

import br.com.rgflorencio.dcuomonitor.dao.DAOException;
import br.com.rgflorencio.dcuomonitor.dao.TransactionalDAO;
import br.com.rgflorencio.dcuomonitor.model.DcuoCharacter;
import br.com.rgflorencio.dcuomonitor.model.DcuoCharacterEntry;
import br.com.rgflorencio.dcuomonitor.model.DcuoCharacterStatus;
import br.com.rgflorencio.dcuomonitor.model.DcuoSummaryStatus;

/**
 * TODO DOCUMENT ME!
 * @author sandro.vieira
 * @version 1.0, 25/08/2015 - sandro.vieira - Implementacao.
 */
public interface DcuoCharacterDAO extends TransactionalDAO {

    /**
     * TODO DOCUMENT ME!
     * @param id
     * @return
     * @throws DAOException 
     */
    List<DcuoCharacterStatus> findByLeagueId(int leagueId) throws DAOException;

    /**
     * TODO DOCUMENT ME!
     * 
     * @param id
     * @param startDate
     * @param endDate
     * @return
     * 
     * @throws DAOException
     */
    List<DcuoCharacterEntry> findAllEntriesByCharacterId(int id, Date startDate, Date endDate) throws DAOException;

    /**
     * TODO DOCUMENT ME!
     * @return
     * @throws DAOException
     */
    DcuoSummaryStatus findSummaryStatus() throws DAOException;

    /**
     * TODO DOCUMENT ME!
     * @param character
     * @throws DAOException
     */
    DcuoCharacter persist(DcuoCharacter character) throws DAOException;

    /**
     * TODO DOCUMENT ME!
     * @throws DAOException
     */
    void updateStatus() throws DAOException;
}
