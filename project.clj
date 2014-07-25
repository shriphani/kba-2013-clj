(defproject kba_2013_clj "0.1.0-SNAPSHOT"
  :description "KBA 2013 processing codebase"
  :url ""
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[byte-streams "0.1.13"]
                 [ch.qos.logback/logback-classic "1.0.13"]
                 [cheshire "5.3.1"]
                 [edu.stanford.nlp/stanford-parser "3.3.1"]
                 [org.apache.commons/commons-compress "1.8"]
                 [org.apache.thrift/libthrift "0.9.1"]
                 [org.bovinegenius/exploding-fish "0.3.4"]
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.cli "0.3.1"]]
  :java-source-paths ["gen-java"]
  :main kba-2013-clj.dump-uris)
