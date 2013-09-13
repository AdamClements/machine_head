(defproject clojurewerkz/machine_head "1.0.0-SNAPSHOT"
  :description "Clojure MQTT client"
  :dependencies [[org.clojure/clojure          "1.5.1"]
                 [org.eclipse.paho/mqtt-client "0.4.0"]
                 [clojurewerkz/support         "0.18.0"]]
  :profiles {:1.4 {:dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.6 {:dependencies [[org.clojure/clojure "1.6.0-master-SNAPSHOT"]]}
             :master {:dependencies [[org.clojure/clojure "1.6.0-master-SNAPSHOT"]]}
             :dev {:resource-paths ["test/resources"]
                   :plugins [[codox "0.6.4"]]
                   :codox {:sources ["src/clojure"]
                           :output-dir "doc/api"}}}
  :aliases {"all" ["with-profile" "dev:dev,1.3:dev,1.4:dev,1.6:dev,master"]}
  :repositories {"eclipse-paho" {:url "https://repo.eclipse.org/content/groups/paho/"
                                 :snapshots false
                                 :releases {:checksum :fail}}}
  :javac-options      ["-target" "1.6" "-source" "1.6"]
  :jvm-opts           ["-Dfile.encoding=utf-8"]
  :source-paths       ["src/clojure"]
  :java-source-paths  ["src/java"])