package com.brutus.abio.persistance.order;


import eu.europa.esig.dss.enumerations.DigestAlgorithm;
import eu.europa.esig.dss.spi.DSSUtils;
import eu.europa.esig.dss.utils.Utils;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Arrays;
import java.util.UUID;

public class ShortIdGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor session, Object object) throws HibernateException {
        String uuid = UUID.randomUUID().toString(); // Generate a UUID
        byte[] hash = DSSUtils.digest(DigestAlgorithm.SHA256, uuid.getBytes());

        byte[] bytes = Arrays.copyOfRange(hash, 0, 5);

        return Utils.toHex(bytes);
    }

}
