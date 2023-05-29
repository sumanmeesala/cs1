package hudson.cli;

import jenkins.model.Jenkins;
import hudson.model.ListView;

Jenkins jenkins = Jenkins.getInstance()

def viewName = 'lhhr_Athna'
jenkins.addView (new ListView(viewName))

job('Athna_cc_trigger') {

    lhhrmthd.desc('Athna_cc_trigger')
    lhhrmthd.cmd('Athna_cc_trigger')
    lhhrmthd.pub('Athna_cc_trigger')
                   
    myView = hudson.model.Hudson.instance.getView(viewName)
    myView.doAddJobToView('athna_cc_trigger') 
    jenkins.save()
    
                        }

