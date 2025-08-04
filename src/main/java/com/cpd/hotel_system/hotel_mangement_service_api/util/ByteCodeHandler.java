package com.cpd.hotel_system.hotel_mangement_service_api.util;

import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialBlob;
import java.nio.charset.StandardCharsets;
import java.sql.Blob;
import java.sql.SQLException;

@Service
public class ByteCodeHandler {

    public Blob stringToBlob(String data) throws SQLException {
        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);
        return  new SerialBlob(bytes);

    }



}
