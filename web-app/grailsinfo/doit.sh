#!/bin/bash
echo "Bash version ${BASH_VERSION}..."

changeGrailsVersion () {
  echo "------------------------------------------------------------"
  echo "in function changeGrailsVersion, first arg = $1"
  grailsHome="grails-$1"
  echo "in function changeGrailsVersion, grailsHome = $grailsHome"
  cd /home/ashburndave/localapps
  rm grails
  ln -s $grailsHome grails
  grails --version
  echo "------------------------------------------------------------"
}

createGrailsApp2 () {
  echo "------------------------------------------------------------"
  gvernodots=`echo "$1" | sed "s/\.//g"`
  shortname="grails${gvernodots}"
  appname="${shortname}app"
  mkdir -p ~/grailsinfo/${shortname}
  cd /home/ashburndave/g2projs
  grails create-app ${appname}
  tree -d -L 3 ${appname} > ~/grailsinfo/${shortname}/newtreedir.txt
  cd /home/ashburndave/g2projs/${appname}
  grails integrate-with --git
  grails integrate-with --eclipse
  ls -latr . > ~/grailsinfo/${shortname}/newdirlist.properties
  cp -p ./application.properties ~/grailsinfo/${shortname}/application.properties
  cp -p ./.project ~/grailsinfo/${shortname}/.project
  cp -p ./.classpath ~/grailsinfo/${shortname}/.classpath
  cp -p ./.gitignore ~/grailsinfo/${shortname}/.gitignore
  cp -p ./grails-app/conf/BootStrap.groovy ~/grailsinfo/${shortname}/BootStrap.groovy
  cp -p ./grails-app/conf/BuildConfig.groovy ~/grailsinfo/${shortname}/BuildConfig.groovy
  cp -p ./grails-app/conf/Config.groovy ~/grailsinfo/${shortname}/Config.groovy
  cp -p ./grails-app/conf/DataSource.groovy ~/grailsinfo/${shortname}/DataSource.groovy
  cp -p ./grails-app/conf/UrlMappings.groovy ~/grailsinfo/${shortname}/UrlMappings.groovy

  grails install-templates
  grails refresh-dependencies
  grails dependency-report > ~/grailsinfo/${shortname}/dependency-report.txt
  #mkdir -p ./grails-app/domain/com/acme
  #cp -p ../Book.groovy ./grails-app/domain/com/acme/Book.groovy
  #grails generate-all ashburndev.Book
  grails stats > ~/grailsinfo/${shortname}/stats.txt
  echo "------------------------------------------------------------"
}

doit2 () {
  echo "------------------------------------------------------------"
  echo "in function doit, first arg = $1"
  changeGrailsVersion $1
  createGrailsApp2 $1
}

doit20x () {
for x in {0..4}
  do
     doit2 "2.0.${x}"
  done
}

doit21x () {
for x in {0..5}
  do
     doit2 "2.1.${x}"
  done
}

doit22x () {
for x in {0..5}
  do
     doit2 "2.2.${x}"
  done
}

doit23x () {
for x in {0..11}
  do
     doit2 "2.3.${x}"
  done
}

doit24x () {
for x in {0..5}
  do
     doit2 "2.4.${x}"
  done
}

doit25x () {
for x in {0..3}
  do
     doit2 "2.5.${x}"
  done
}

doitall () {
  doit20x
  doit21x
  doit22x
  doit23x
  doit24x
  doit25x
}

doitall



