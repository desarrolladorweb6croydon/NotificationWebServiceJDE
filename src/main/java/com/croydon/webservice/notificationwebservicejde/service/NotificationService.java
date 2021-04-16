/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croydon.webservice.notificationwebservicejde.service;

import com.croydon.jde.SendWebNotifications;
import org.springframework.stereotype.Service;

/**
 *
 * @author DesarrolladorWeb6
 */
@Service
public class NotificationService {


    public SendWebNotifications getNotificationsResponse() {
        SendWebNotifications sendWebNotifications = new SendWebNotifications();
        sendWebNotifications.setReturn("Success: Procesando...");
        return sendWebNotifications;
    }

}
