/*
 * Copyright(C) 1999-2010 Alibaba Group Holding Limited All rights reserved. Licensed under the Apache License, Version
 * 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the
 * License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language governing permissions and limitations
 * under the License.
 */
package com.alibaba.doris.client.net;

import java.util.Properties;

/**
 * DataSource. Config Properties:<br/>
 * <li>ip <li>port
 * 
 * @author Kun He (Raymond He), kun.hek@alibaba-inc.com
 * @since 1.0 2011-4-22
 */
public interface DataSource {

    void setIp(String ip);

    String getIp();

    void setPort(int port);

    int getPort();

    public Connection getConnection();


    
    public void setSequence(int value);
    
    public int getSequence();
    
    public void setNo(int no);

    public int getNo();
    
	/**
	 * set config properties.
	 * @param properties
	 */
	void setConfigProperties(Properties properties);
	
	/**
	 *  Init config after setting values.
	 */
	void initConfig();

	void close();
}
