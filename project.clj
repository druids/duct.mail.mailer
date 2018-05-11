(defproject duct.mail.mailer "0.0.0"
  :description "A Duct boundary for sending e-mails"
  :url "https://github.com/druids/duct.sms.sender"
  :license {:name "MIT License"
            :url "http://opensource.org/licenses/MIT"}

  :dependencies [[integrant "0.6.3"]]


  :profiles {:dev {:plugins [[lein-cloverage "1.0.10"]
                             [lein-kibit "0.1.6"]
                             [jonase/eastwood "0.2.5"]]

                   :dependencies [[org.clojure/clojure "1.9.0"]]}})
