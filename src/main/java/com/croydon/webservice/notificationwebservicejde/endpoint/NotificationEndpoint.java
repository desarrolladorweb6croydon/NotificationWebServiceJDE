/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.croydon.webservice.notificationwebservicejde.endpoint;

import com.croydon.jde.SendWebNotificationsRequest;
import com.croydon.jde.SendWebNotificationsResponse;
import com.croydon.webservice.notificationwebservicejde.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author DesarrolladorWeb6
 */
@Endpoint
public class NotificationEndpoint {
    
    @Autowired
    NotificationService notificationService;
    
    private static final String NAMESPACE_URI = "http://jde.croydon.com/";
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendWebNotificationsRequest")
    @ResponsePayload
    public SendWebNotificationsResponse getNotification(@RequestPayload SendWebNotificationsRequest request) {
        SendWebNotificationsResponse response = new SendWebNotificationsResponse();
        request.setAn8("an8");
        request.setOperation("operation");
        request.setPath("path");
        response.setSendWebNotifications(notificationService.getNotificationsResponse());
        return response;
    }
    
}
