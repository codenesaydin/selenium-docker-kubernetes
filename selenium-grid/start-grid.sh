BASEDIR=$(dirname $0)
echo "Script location: ${BASEDIR}"

#! /bin/bash
osascript -e 'tell app "Terminal"
    do script "cd '${BASEDIR}' &&
    java -jar selenium-server-standalone-3.141.59.jar -role hub -hubConfig hub.json"
end tell'
osascript -e 'tell app "Terminal"
    do script "cd '${BASEDIR}' &&
    java -jar -Dwebdriver.chrome.driver=/opt/chromedriver selenium-server-standalone-3.141.59.jar -role node -nodeConfig node.json"
end tell'