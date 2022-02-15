using Newtonsoft.Json;
using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace August_Twelve__.net_
{
    class RestMesa
    {
        private String url;
        private HttpWebRequest request;

        public RestMesa(String url, String tipo) {

            this.url = url;
            this.request = (HttpWebRequest)WebRequest.Create(this.url);
            this.request.Method = "GET";

            switch (tipo) {
                case "GET":
                    this.request.Method = "GET";
                    break;
                case "POST":
                    this.request.Method = "POST";
                    break;
            }

            this.request.ContentType = "application/json";
            request.Accept = "application/json";
        }

        public String getItem()
        {
            try
            {
                WebResponse response = request.GetResponse();
                Stream strReader = response.GetResponseStream();

                if (strReader != null)
                {
                    StreamReader sr = new StreamReader(strReader);
                    String str = sr.ReadToEnd();
                    return str;
                }
                else return null;
            }
            catch (WebException e) {
                return null;
            }
        }
    }
}
