/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.vkparser.modules.interfaces;

import java.io.IOException;
import java.util.List;
import org.tyaa.vkparser.model.VKCandidate;

/**
 *
 * @author Юрий
 */
public interface IResultSaver {
    
    boolean saveCandidates(List<VKCandidate> candidatesList) throws IOException;
}