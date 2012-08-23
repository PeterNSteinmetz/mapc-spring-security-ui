/* Copyright 2009-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import org.codehaus.groovy.grails.plugins.springsecurity.SpringSecurityUtils

/**
 * @author <a href='mailto:kkdpan@gmail.com'>Di Pan</a>
 */
class MapcSpringSecurityUiGrailsPlugin {

	String version = '0.1.3'
	String grailsVersion = '1.2.2 > *'
	Map dependsOn = [springSecurityCore: '0.4 > *',
	                 mail: '0.9 > *',
						  jquery: '1.4.2.5 > *',
						  jqueryUi: '1.8.2.3 > *',
						  famfamfam: '1.0 > *']

	List pluginExcludes = [
		'docs/**',
		'src/docs/**',
		'scripts/CreateS2UiTestApps.groovy',
		'scripts/Fixpdf.groovy',
		'lib/**',
		'test/**'
	]

	String author = 'Di Pan'
	String authorEmail = 'kkdpan@gmail.com'
	String title = 'MAPC_DBS administrator interface extensions for the Spring Security plugin.'
	String description = 'MAPC_DBS administrator interface extensions for the Spring Security plugin. This plug-in is customized based on spring-security-ui 0.1.3'
	String documentation = 'http://grails.org/plugin/spring-security-ui'

	String license = 'APACHE'
	def organization = [ name: 'Barrow Neurological Institute', url: 'http://www.thebarrow.org' ]
	def developers = [
		 [ name: 'Di Pan', email: 'kkdpan@gmail.com' ] ]
	def issueManagement = [ system: 'JIRA', url: 'http://jira.grails.org/browse/GPSPRINGSECURITYUI' ]
	def scm = [ url: 'https://github.com/PeterNSteinmetz/mapc-spring-security-ui/' ]

	def doWithSpring = {

		def conf = SpringSecurityUtils.securityConfig
		if (!conf || !conf.active) {
			return
		}

		println 'Configuring Spring Security UI ...'

		SpringSecurityUtils.loadSecondaryConfig 'DefaultUiSecurityConfig'
	}
}