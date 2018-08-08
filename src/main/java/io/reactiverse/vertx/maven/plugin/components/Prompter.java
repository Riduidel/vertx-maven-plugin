/*
 *
 *   Copyright (c) 2016-2018 Red Hat, Inc.
 *
 *   Red Hat licenses this file to you under the Apache License, version
 *   2.0 (the "License"); you may not use this file except in compliance
 *   with the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *   implied.  See the License for the specific language governing
 *   permissions and limitations under the License.
 */
package io.reactiverse.vertx.maven.plugin.components;

import java.io.IOException;

/**
 * A simple component to retrieve user input.
 *
 * @author <a href="http://escoffier.me">Clement Escoffier</a>
 */
public interface Prompter {

    /**
     * Prompt user for a string.
     */
    String prompt(String message) throws IOException;

    /**
     * Prompt user for a string; if user response is blank use a default value.
     */
    String promptWithDefaultValue(String message, String defaultValue) throws IOException;
}
